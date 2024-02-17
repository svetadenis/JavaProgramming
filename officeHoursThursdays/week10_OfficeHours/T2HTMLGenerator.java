package week10_OfficeHours;

public class T2HTMLGenerator {
    // we are assuming that we can only generate from 1-9 of a specific tag
    public static String generateHtml(String input){ //   div2;li1

        String[] eachTag = input.split(";"); // [div2, li1]
        String html = "";

        for(String each : eachTag){
            String tag = each.substring(0, each.length() - 1); // all the String except the last character
            int num = Integer.parseInt(each.substring(each.length() - 1)); // only return the last character
            String tempHtml = "<" + tag +"> </" + tag + ">\n";
            html += tempHtml.repeat(num);
        }
        return html;
    }

    public static void main(String[] args) {
        System.out.println(generateHtml("div2;li1"));
        System.out.println(generateHtml("java3;apple2;computer2"));
    }

}

/*

T2HtmlGenerator [String, wrapper class, loop, array]

Create a program that will read the request for the HTML that will be generated. Each request will be made of the tags and how many times that tag should be repeated. Each separate HTML tag will be separated by a semi-colon;

Tags should be surrounded in diamond brackets and each closing tag has a / too

Note: we are not creating a fully valid HTML structure. It is just a task

    Ex:
        Input:
            div2;li1

        Output:
            <div> </div>
            <div> </div>
            <li> </li>

    Ex:
        Input:
            ul1;li3;button2

        Output:
            <ul> </ul>
            <li> </li>
            <li> </li>
            <li> </li>
            <button> </button>
            <button> </button>
 */

