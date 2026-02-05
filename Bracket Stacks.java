import java.util.*;
class StackingBrackets{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Use a stack
            //System.out.println(input);
            Stack<Character> brackets = new Stack<>();
            boolean valid = true;
            if(input.isEmpty())
            {
                //technically is right
                valid = true;
            }
            else if(input.charAt(0) == '}' || input.charAt(0) == ')' || input.charAt(0) == ']')
                valid = false; //Immediately invalid if starts witha close bracket
            else
            {
                //Verify if it starts correctly
                for(int i = 0; i < input.length(); i++)
                {
                    //populate stack
                    switch(input.charAt(i))
                    {
                        //Populate stack
                        case '{': brackets.push('{'); break;
                        case '(': brackets.push('('); break;
                        case '[': brackets.push('['); break;
                        
                        //Stack verification
                        case '}':
                            if(brackets.isEmpty())
                            {
                                valid = false;
                                brackets.push('@');
                            }
                            else
                                valid = (brackets.pop() == '{'); 
                        break;
                        case ')':
                            if(brackets.isEmpty())
                            {
                                valid = false;
                                brackets.push('@');
                            }
                            else
                                valid = (brackets.pop() == '('); 
                        break;
                        case ']':
                            if(brackets.isEmpty())
                            {
                                valid = false;
                                brackets.push('@');
                            }
                            else
                                valid = (brackets.pop() == '['); 
                        break;
                    }
                    if(!valid)
                        break;
                }
                valid = brackets.isEmpty();
            }
            System.out.println(valid);
		}
        sc.close();
		
	}
}



