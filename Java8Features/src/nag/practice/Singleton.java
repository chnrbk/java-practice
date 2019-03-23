package nag.practice;
public class Singleton {

    private static volatile Singleton _instance;

    /**
     * Double checked locking code on Singleton
     * @return Singelton instance
     */
    public static Singleton getInstance() {
        if (_instance == null) {
            synchronized (Singleton.class) {
                if (_instance == null) {
                    _instance = new Singleton();
                }
            }
        }
        return _instance;
    }

}


//Read more: https://javarevisited.blogspot.com/2011/04/top-20-core-java-interview-questions.html#ixzz5d5A9yykd