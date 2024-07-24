import java.util.Scanner;

public class sparkGPT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hritkesh chat-GPT");
        String search = "x";
        do {
            System.out.print("You : ");
            search = input.nextLine().toLowerCase();
            if(search.equals("hello")){
                System.out.println("Hey i m Bot spark How can help you");
            }
            else if(search.equalsIgnoreCase("HI") || search.equalsIgnoreCase("hey")){
                System.out.println("Bot : Hello");
            } else if (search.equalsIgnoreCase("wap to find the square of given no in java") || search.equalsIgnoreCase("square in java")) {
                System.out.println("import java.util.Scanner;\n" +
                        "public class square {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner input = new Scanner(System.in);\n" +
                        "\n" +
                        "        System.out.println(\"Enter no :\");\n" +
                        "        int no = input.nextInt();\n" +
                        "        int square = no * no;\n" +
                        "        System.out.println(square);\n" +
                        "    }\n" +
                        "}\n   ");
            } else if (search.equalsIgnoreCase("sum of two no in java")) {
                System.out.println("""
                        import java.util.Scanner;

                        public class sumofTwoNo {
                            public static void main(String[] args) {
                                Scanner input = new Scanner(System.in);

                                System.out.println("Enter A :");
                                int a = input.nextInt();

                                System.out.println("Enter b :");
                                int b = input.nextInt();

                                int sum = a + b;
                                System.out.println("Sum of\\nA = " + a + "\\n"+
                                        "B = " + b + "\\nSum = " + sum);
                            }
                        }
                        \s""");

            } else if (search.equalsIgnoreCase("ms dhoni") || search.equalsIgnoreCase("dhoni")) {
                System.out.println("""
                        Bot : Mahendra Singh Dhoni, commonly known as MS Dhoni, is a former Indian international\s
                        cricketer who is widely regarded as one of the greatest cricket captains of all time. \s Born on July 7, 1981,
                        in Ranchi, Jharkhand, India, Dhoni made his debut for the Indian cricket team in December 2004 in an ODI match\s
                        against Bangladesh. He quickly rose through the ranks due to his exceptional batting skills, wicket-keeping ability,
                        and calm demeanor under pressure.

                        Dhoni is particularly famous for his captaincy, leading the Indian team to several historic victories.\n
                        One of his crowning achievements was leading India to victory in the inaugural ICC T20 World Cup in 2007,\s
                        where his innovative leadership and finishing abilities earned him widespread acclaim.\s

                        Under his captaincy, India also won the ICC Cricket World Cup in 2011, India's first World Cup victory in 28 years.\s
                        Dhoni played a pivotal role in the final match, scoring an unbeaten 91 runs and sealing the win with a six, a moment\s 
                        etched in the memories of cricket fans worldwide.

                        Beyond his captaincy, Dhoni was known for his finishing prowess in limited-overs cricket,\s
                        often coming to bat lower down the order and rescuing the team from difficult situations.\s 
                        His calmness and ability to absorb pressure in high-stakes situations earned him the nickname "Captain Cool."

                        In addition to his success in limited-overs cricket, Dhoni also had a successful
                        Test career, playing 90 matches and scoring over 4,800 runs. He announced his retirement from Test cricket\s
                        in December 2014.

                        In August 2020, Dhoni announced his retirement from international cricket, marking the end of an illustrious\s
                        career that spanned over 16 years. Even after retirement, he remained involved in cricket, captaining the Chennai\s
                        Super Kings (CSK) franchise in the Indian Premier League (IPL) and continuing to inspire millions of fans around\s
                        the world.""");
            } else if (search.equalsIgnoreCase("virat kohli") || search.equalsIgnoreCase("kohli") || search.equalsIgnoreCase("virat")) {
                System.out.println("Bot : Virat Kohli is an Indian international cricketer and one of the most prominent figures in modern cricket. Born on November 5, 1988, in Delhi, India, Kohli is renowned for his exceptional batting skills, fierce competitiveness, and aggressive on-field demeanor.\n" +
                        "\n" +
                        "Kohli made his international debut for India in August 2008 in an ODI match against Sri Lanka. He quickly rose through the ranks due to his consistent performances across formats. Known for his technically sound batting technique, Kohli has amassed numerous records and accolades throughout his career.\n" +
                        "\n" +
                        "One of Kohli's most remarkable achievements is his consistency in run-scoring, especially in the limited-overs formats. He holds several records for the fastest centuries and the most centuries in ODI cricket. Kohli is also one of the few batsmen to have scored more than 10,000 runs in ODIs.\n" +
                        "\n" +
                        "In Test cricket, Kohli has been equally prolific, amassing a large number of runs and centuries across various conditions and against all opponents. He has led the Indian cricket team as captain in Test matches, ODIs, and T20Is.\n" +
                        "\n" +
                        "Kohli's leadership skills came to the forefront when he led the Indian team to historic Test series victories in Australia in 2018-19 and against England at home in 2021. Under his captaincy, India also reached the ICC Champions Trophy final in 2017.\n" +
                        "\n" +
                        "Apart from his on-field exploits, Kohli is known for his passion for fitness and has played a significant role in promoting fitness culture among cricketers in India. He has a massive following on social media and is considered one of the most marketable athletes globally.\n" +
                        "\n" +
                        "In August 2021, Kohli stepped down as the captain of India's T20I team but continued to lead the side in Test and ODI cricket. His impact on the game, both as a player and a leader, has made him one of the most influential figures in the cricketing world. ");
            } else if (search.equalsIgnoreCase("leetCode 525")) {
                System.out.println("Contiguous Array" +
                        "\nGiven a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.");
            } else if (search.equalsIgnoreCase("cube in java")) {
                System.out.println("import java.util.Scanner;\n" +
                        "\n" +
                        "public class cube{\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner input = new Scanner(System.in);\n" +
                        "\n" +
                        "        System.out.println(\"Enter no :\");\n" +
                        "        int no = input.nextInt();\n" +
                        "        int cube = no * no * no;\n" +
                        "        System.out.println(\"Cube of \" + no + \" = \" + cube);\n" +
                        "    }\n" +
                        "}\n");
            } else if (search.equalsIgnoreCase("sum of two in cpp") || search.equalsIgnoreCase("sum of two no in c++")) {
                System.out.println("#include <iostream>\n" +
                        "using namespace std;\n" +
                        "int main() {\n" +
                        "    int num1, num2;\n" +
                        "    \n" +
                        "    cout << \"Enter first number: \";\n" +
                        "    cin >> num1;\n" +
                        "    \n" +
                        "    cout << \"Enter second number: \";\n" +
                        "    cin >> num2;\n" +
                        "    \n" +
                        "    int sum = num1 + num2;\n" +
                        "    \n" +
                        "    cout << \"The sum of \" << num1 << \" and \" << num2 << \" is: \" << sum << std::endl;\n" +
                        "    \n" +
                        "    return 0;\n" +
                        "}\n");
            }
            else if (search.equalsIgnoreCase("leetcode 1")){
                System.out.println("1. Two Sum" +
                        "\nGiven an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.\n" +
                        "\n" +
                        "You may assume that each input would have exactly one solution, and you may not use the same element twice.\n" +
                        "\n" +
                        "You can return the answer in any order.");
            }


        }while (!search.equals("0"));

    }
}

//search.equalsIgnoreCase("X")