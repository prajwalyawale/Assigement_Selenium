class occurrences_of_char
{
	public static void main(String[] args)
	{	
	
String str="ababababdschba";

char occ='a';
int count=0;
int len=str.length();

for(int i=0;i<=len;i++)
{
	if(str.charAt(i)==occ)
	{
		count++;
		System.out.println(count);
	}
}

	
		
	}
	
	
}