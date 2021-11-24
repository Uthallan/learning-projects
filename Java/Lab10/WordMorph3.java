// word morph for lab10 array method exercises
import java.util.Random;
import java.util.Scanner;

public class WordMorph3 {

    public static void main(String[] args) {      
          // list of all 3 letter words in the dictionary
          String[] dictionary = {    
              "abc","ace","act","add","ado","aft","age","ago","aid","ail","aim",
              "air","ala","alb","ale","all","alp","ami","amp","amy","ana","and",
              "ani","ant","any","ape","apt","arc","are","ark","arm","art","ash",
              "ask","ass","ate","auk","awe","awl","awn","axe","aye","bad","bag",
              "bah","bam","ban","bar","bat","bay","bed","bee","beg","bel","bet",
              "bey","bib","bid","big","bin","bit","biz","boa","bob","bog","bon",
              "boo","bop","bow","box","boy","bub","bud","bug","bum","bun","bus",
              "but","buy","bye","cab","cam","can","cap","car","cat","caw","chi",
              "cit","cod","cog","col","con","coo","cop","cos","cot","cow","cox",
              "coy","cpu","cry","cub","cud","cue","cup","cur","cut","dab","dad",
              "dam","day","den","dew","dey","did","die","dig","dim","din","dip",
              "doe","dog","don","dot","dry","dub","dud","due","dug","dun","dye",
              "ear","eat","ebb","eel","eft","egg","ego","eke","elk","ell","elm",
              "end","era","ere","erg","err","eta","etc","eve","ewe","eye","fad",
              "fag","fan","far","fat","fay","fed","fee","few","fib","fig","fin",
              "fir","fit","fix","flu","fly","fob","foe","fog","fop","for","fox",
              "fro","fry","fum","fun","fur","gab","gad","gag","gal","gam","gap",
              "gar","gas","gay","gee","gel","gem","get","gig","gin","gnu","gob",
              "god","gog","got","gum","gun","gut","guy","gym","gyp","had","ham",
              "hap","hat","haw","hay","hem","hen","her","hew","hex","hey","hid",
              "him","hip","his","hit","hob","hoc","hoe","hog","hoi","hop","hot",
              "how","hoy","hub","hue","hug","huh","hum","hut","ice","icy","iii",
              "ill","imp","ink","inn","ion","ire","irk","ivy","jab","jag","jam",
              "jar","jaw","jay","jet","jig","job","jog","jot","joy","jug","jut",
              "keg","ken","key","kid","kin","kit","lab","lac","lad","lag","lam",
              "lap","law","lax","lay","lea","led","lee","leg","let","lew","lid",
              "lie","lim","lip","lit","lob","log","lop","lot","low","loy","lug",
              "lux","lye","mad","man","map","mar","mat","maw","max","may","men",
              "met","mew","mid","mig","min","mix","mob","moo","mop","mot","mow",
              "mud","mug","mum","nab","nag","nap","nay","nee","net","new","nib",
              "nil","nip","nit","nob","nod","non","nor","not","now","nun","nut",
              "oaf","oak","oar","oat","odd","ode","off","oft","ohm","oil","old",
              "one","opt","orb","ore","our","out","ova","owe","owl","own","pad",              
              "pal","pan","pap","par","pat","paw","pax","pay","pea","pee","peg",
              "pen","pep","per","pet","pew","phi","pie","pig","pin","pip","pit",
              "ply","pod","poi","pol","pop","pot","pow","ppm","pro","pry","psi",
              "pub","pug","pun","pup","pus","put","qua","quo","rag","raj","ram",
              "ran","rap","rat","raw","ray","reb","red","rep","ret","rev","rho",
              "rib","rid","rig","rim","rip","rob","rod","roe","rot","row","rub",
              "rue","rug","rum","run","rut","rye","sac","sad","sag","sap","sat",
              "saw","sax","say","sea","sec","see","sen","seq","set","sew","sex",
              "she","shy","sib","sic","sin","sip","sir","sis","sit","six","ski",
              "sky","sly","sob","sod","son","sop","sou","sow","soy","spa","spy",
              "sub","sud","sue","sum","sun","sup","tab","tad","tag","tam","tan",
              "tao","tap","tar","tat","tau","tax","tea","ted","tee","ten","the",
              "thy","tic","tid","tie","til","tin","tip","tit","toe","tog","ton",
              "too","top","tor","tot","tow","toy","try","tub","tug","tum","tun",
              "two","ugh","urn","use","van","vat","vee","vet","vex","via","vie",
              "vii","vis","viz","von","vow","wad","wag","wah","wan","war","was",
              "wax","way","web","wed","wee","wet","who","why","wig","win","wit",
              "woe","wok","won","woo","wop","wow","wry","yah","yak","yam","yap",
              "yaw","yea","yen","yet","yin","yip","yon","you","yow","yuh","zag",
              "zap","zig","zip","zoo"};
          
        // get the starting word
        Scanner scnr = new Scanner(System.in);
        System.out.println("Word morph challenge.");
        System.out.println("Can you gradually change a word "+
                           "one letter at a time into 10 new words?");

        // pick a random starting word
        Random rand = new Random();
        String word = dictionary[rand.nextInt(dictionary.length)];

        // we are using a loop to repeat 10 time
        System.out.println("Each step enter 2 letters, "+
                           "the old letter and the new letter.");
        System.out.println("For example typing \"on\" would replace 'o' with 'n'"); 
        System.out.println("Type \"hint\" if you need a hint"); 
        
        System.out.print("0\t" + word + "  : ");
        
        // array to hold the history of 11 words (0-10)
        String history[] = new String[11];
        
        
        history[0] = word;  // put the starting word at index 0 in the history array
        
        for (int i = 1; i <= 10; i++) {
            String change;
            
           // read the user's change and check if they want a hint
            for (;;) {
                change = scnr.next();
                if (!change.equals("hint"))
                    break;                      // they are not asking for a hint
                printHints(word, dictionary);
                System.out.print(i-1 + "\t" + word + "  : "); // reprint prev prompt              
            }     
            
            // get the two characters into char variables
            char oldChar = change.charAt(0);
            char newChar = change.charAt(1);
            // replace the character in the word
            word = word.replace(oldChar, newChar);
            
            // Exercise 3: Check if word is in the dictionary.
            // REPLACE the next 9 lines. USE your inInArray() method instead of the loop.
            if (isInArray(word, dictionary) == false) {
                System.out.println("\"" + word + "\" is not a valid word. Exiting.");
                System.exit(1);
            }
            /* ORIGINAL CODE FOR EXERCISE 3
            boolean foundIt = false;
            for (int j = 0; j < dictionary.length; j++) {
                if (word.equals(dictionary[j])) 
                    foundIt = true;
            }
            if (!foundIt) {
                System.out.println("\"" + word + "\" is not a valid word. Exiting.");
                System.exit(1);
            }
            */

            // Exercise 4:Check if the new word already appeared in history.
            // USE your inInArray() method instead of the loop.
            if (isInArray(word, history) == true) {
                System.out.println("You used '"+word+"' already. Exiting.");
                System.exit(1);
            }            
            /* ORIGINAL CODE FOR EXERCISE 4
            for (int j = 0; j < i; j++) {
                if (word.equals(history[j])) {
                	System.out.println("You used '"+word+"' already. Exiting.");
                    System.exit(1);
                }
            }
            */

            



            // add the new word to the history 
            history[i] = word;
            
            // print the new word
            System.out.print(i + "\t" + word + "  : ");
        }
   
        System.out.println("YOU DID IT!");
        scnr.close();
    }

    // Exercise 2: method to check if a word is in the array, returns true if the word is found
    public static boolean isInArray(String word, String[] array) {
        boolean bool = false;
        for (int i = 0; i < array.length; i++){
            if (word.equals(array[i])){
                bool = true;
                break;
            }
        }
        return bool;
    }

    // Exercise 5: count the number of non-matching letters between 2 words
    public static int countNonMatchingLetters(String s1, String s2) {
        int nonMatchingLetters = 0;
        for (int i = 0; i<s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                nonMatchingLetters++;
            }
        }
        return nonMatchingLetters;
    }


    // Exercise 6: method to print hint words that differ by 1 letter
    public static void printHints(String word, String[] dictionary) {
    	System.out.print("\t\t");
        for (int i = 0; i<dictionary.length;i++) {
            if (countNonMatchingLetters(word, dictionary[i]) == 1) {
                System.out.print(dictionary[i] + " ");
            }
        }
        System.out.println();
    }
}
