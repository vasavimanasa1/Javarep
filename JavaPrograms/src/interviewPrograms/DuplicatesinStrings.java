package interviewPrograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesinStrings {

	public static void main(String[] args)
	{
		String names[]= {"manasa","krishna","arjun","manasa","krishna"};
		Set<String> store=new HashSet<String>();
		for(String name:names)
		{
			if(store.add(name)==false)
			{
				System.out.println("dupicate values are::"+name);
			}
		}

	}

}
