package org.ygba.youthgobudget;

import androidx.lifecycle.LiveData;

import org.ygba.youthgobudget.data.YGBDatabase;
import org.ygba.youthgobudget.data.agriculture.AgricultureQuestion;
import org.ygba.youthgobudget.data.socialdevelopment.SocialDevelopmentQuestion;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class YGBARepository {
    private static YGBARepository INSTANCE;
    private YGBDatabase ygbDatabase;

    private YGBARepository(YGBDatabase ygbDatabase) {
        this.ygbDatabase = ygbDatabase;
    }

    public static YGBARepository getInstance(YGBDatabase ygbDatabase){
        if (INSTANCE == null ) {
            synchronized (YGBARepository.class) {
                if (INSTANCE == null ) {
                    INSTANCE = new YGBARepository(ygbDatabase);
                }
            }
        }
        return INSTANCE;
    }

    public void saveAgricultureQuestion(final AgricultureQuestion agricultureQuestion) {
        YGBDatabase.db_executor.execute(new Runnable() {
            @Override
            public void run() {
                ygbDatabase.agricultureDao().saveAgricultureQuestion(agricultureQuestion);
            }
        });
    }

    public LiveData<List<AgricultureQuestion>> getAllAgricultureQuestions() throws ExecutionException, InterruptedException {
        Callable<LiveData<List<AgricultureQuestion>>> dataCallable = new Callable<LiveData<List<AgricultureQuestion>>>() {
            @Override
            public LiveData<List<AgricultureQuestion>> call() throws Exception {
                return ygbDatabase.agricultureDao().getAllAgricultureAnswers();
            }
        };

        return YGBDatabase.db_executor.submit(dataCallable).get();
    }

    public void saveSocialDevelopmentQuestion(final SocialDevelopmentQuestion socialDevelopmentQuestion) {
        YGBDatabase.db_executor.execute(new Runnable() {
            @Override
            public void run() {
                ygbDatabase.socialDevelopmentDao().saveSocialDevelopmentQuestion(socialDevelopmentQuestion);
            }
        });
    }

    public LiveData<List<SocialDevelopmentQuestion>> getAllSocialDevelopmentQuestions() throws ExecutionException, InterruptedException {
        Callable<LiveData<List<SocialDevelopmentQuestion>>> liveDataCallable = new Callable<LiveData<List<SocialDevelopmentQuestion>>>() {
            @Override
            public LiveData<List<SocialDevelopmentQuestion>> call() throws Exception {
                return ygbDatabase.socialDevelopmentDao().getAllSocialDevelopmentQuestions();
            }
        };

        return YGBDatabase.db_executor.submit(liveDataCallable).get();
    }
}
