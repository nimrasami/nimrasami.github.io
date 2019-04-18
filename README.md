## Welcome to Nimra's webpage
I am pursuing a Bachelor’s Degree in Computer Science from the University of North Carolina at Greensboro. My career aspiration is to work in the field of software development. I am seeking different opportunities to prepare me for the field of Computer Science. 



### About Me

My name is Nimra Sami, I am a first-year student at the University of North Carolina at Greensboro. I am a Computer Scince major and a Math minor. I am seeking to earn a Bachelor’s Degree in Computer Science. In the future, I plan on pursuing a career in the field of software development, eventually furthering my education with a Master’s degree in Software Engineering. 

### Projects
```markdown
Project One 

public class projectone {

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

Project Two 

public class projecttwo  {

    public static boolean palindrome(String stg, int left, int right) {
        if (left > right) {
            return true;
        } else if (stg.charAt(right) != stg.charAt(left)) {
            return false;
        } else {
            return palindrome(stg, left + 1, right - 1);
        }
    }

    public static void main(String[] args) {
        String stg = "nimra";
        System.out.println(palindrome(stg, 0, stg.length() - 1));

        String str = "qazplm";
        System.out.println(palindrome(str, 0, str.length() - 1));
    }
}

```

For more details see [GitHub Flavored Markdown](https://guides.github.com/features/mastering-markdown/).

### Resume 



### Contact


Having trouble with Pages? Check out our [documentation](https://help.github.com/categories/github-pages-basics/) or [contact support](https://github.com/contact) and we’ll help you sort it out.
