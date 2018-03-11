package ru.trelico.data;

import android.app.Application;

import ru.terrakok.cicerone.Cicerone;
import ru.terrakok.cicerone.NavigatorHolder;
import ru.terrakok.cicerone.Router;


public class MyApp extends Application{

//    AppComponent appComponent;
//    UserComponent userComponent;
    public static MyApp INSTANCE;
    private Cicerone<Router> cicerone;
    public static final String DEFAULT_TAG = "mytag";
    public static final String TESTING_TAG = "testingtag";

    @Override
    public void onCreate(){
        super.onCreate();
        INSTANCE = this;
        cicerone = Cicerone.create();
//        appComponent = DaggerAppComponent.builder()
//                .appModule(new AppModule(this))
//                .apiNetworkModule(new ApiNetworkModule())
//                .build();
    }

//    public AppComponent getAppComponent(){
//        return appComponent;
//    }

    public NavigatorHolder getNavigatorHolder() {
        return cicerone.getNavigatorHolder();
    }

    public Router getRouter() {
        return cicerone.getRouter();
    }

//    public UserComponent plusUserComponent() {
//        // always get only one instance
//        if (userComponent == null) {
//            // start lifecycle of chatComponent
//            userComponent = appComponent.plusUserComponent(new UserModule());
//        }
//        return userComponent;
//    }
//
//    public void clearUserComponent() {
//        // end lifecycle of chatComponent
//        userComponent = null;
//    }
}
