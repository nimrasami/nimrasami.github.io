## Welcome to Nimra's webpage
I am pursuing a Bachelor’s Degree in Computer Science from the University of North Carolina at Greensboro. My career aspiration is to work in the field of software development. I am seeking different opportunities to prepare me for the field of Computer Science. 
<img src="https://github.com/nimrasami/nimrasami.github.io/blob/master/Picture.png?raw=true" alt="Picture.png"/>

### About Me

My name is Nimra Sami, I am a first-year student at the University of North Carolina at Greensboro. I am a Computer Scince major and a Math minor. I am seeking to earn a Bachelor’s Degree in Computer Science. In the future, I plan on pursuing a career in the field of software development, eventually furthering my education with a Master’s degree in Software Engineering. 

### Projects
```markdown
Project One: Write a program to print your name on console screen. 
Note:Your program needs to have a method that takes any arbitrary 
string as a a parameter and print it.

Project One
public class projectone {

    public static void main(String[] args) {
 
        System.out.println("My name is Nimra Sami");
        String userstr = "name";
        print(userstr);
    }
    public static void print(String str) {

        System.out.println("Arbitrary string is: " + str);
        
    }
}
```

```markdown
Project Two: Write a recursive program to find the length of a string. 
You should not use length method. 

Project Two 
public class projecttwo {

    public static int Stringlength(String stg) {

        if (stg.equals("")) {
            return 0;
        } else {
            return Stringlength(stg.substring(1)) + 1;
        }
    }
    
    public static void main(String[] args) {
        String stg = "Nimra Sami";
        System.out.println(Stringlength(stg));

    }
}
```

```markdown
Project Three:Method reverse shown below returns the reverse of a String. 
String reverse( String str )

Implement reverse recursively. Do not worry about the inefficiency 
of string concatenation.
Implement reverse by having reverse be the driver for a private 
recursive routine. 
reverse will create a StringBuffer and pass it to the recursive routine.

Project Three
package Recursive;

public class projectthree {

    private String inputString;

    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    private StringBuffer Reverse(String inputString) {
        return reverseRecursion(new StringBuffer(inputString));
    }

    private StringBuffer reverseRecursion(StringBuffer stringBuffer) {
        if (stringBuffer == null || stringBuffer.length() <= 1) {
            return stringBuffer;
        } else {
            return new StringBuffer(reverseRecursion(new StringBuffer
        (stringBuffer.substring(1))) + stringBuffer.substring(0, 1));
        }
    }

    public static void main(String[] args) {
        question5 myObject = new question5();
        myObject.setInputString("NIMRA SAMI");
        System.out.println("Reverse(" + myObject.getInputString() + ") = "
                + myObject.Reverse(myObject.getInputString()));
    }
}

```

### Resume 
<img src="https://raw.githubusercontent.com/nimrasami/nimrasami.github.io/master/Resume.png" alt="Resume.png"/>

### Contact
email: nimrasami@icloud.com

Number: (336) 848-9654

Linkedin: linkedin.com/in/nimra-sami-14134a174

