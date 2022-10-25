package singelton;

public class Singletonpersona {
	
    private static Singletonpersona instance;
    
	private String name;
	private int age;
	
    private Singletonpersona() {}
       
    
    public Singletonpersona(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public static Singletonpersona getInstance(String name , int age ) {
        if (instance == null) {
            instance = new Singletonpersona();
        }
        return instance;
    }

}
