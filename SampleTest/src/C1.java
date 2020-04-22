

public class C1 implements I1, I3
{
    public static void main(String[] args)
    {
        System.out.println(new C1().getGreeting());
        String s="abc";
        System.out.println(s.hashCode());
        String s1= "bcd";
        System.out.println(s1.hashCode());
    }

	@Override
	public String getGreeting() {
		// TODO Auto-generated method stub
		return I3.super.getGreeting();
	}
}