import java.util.*;

public class SimplifyPaths {

    public static String simplifyPath(String path) {

        Stack<String> stack = new Stack<>();
        while(path.length() > 0 && path.charAt(path.length() - 1) == '/') {
            path = path.substring(0, path.length() - 1);
        }

        int start = 0;
        for(int i = 1; i < path.length(); i++) {
            if(path.charAt(i) == '/') {
                stack.push(path.substring(start, i));
                start = i;
            }
            else if(i == path.length() - 1) {
                stack.push(path.substring(start));
            }
        }

        LinkedList<String> list = new LinkedList<String>();
        int back = 0;
        while(!stack.isEmpty()) {
            String top = stack.pop();
            if(top.equals("/.") || top.equals("/")) {
                // Do Nothing
            }
            else if(top.equals("/..")) {
                // Keep track of the number of back indirection
                back += 1;
            }
            else {
                if(back > 0) {
                    back -= 1;
                }
                else {
                    list.push(top);
                }
            }

        }

        // In case of empty String
        if(list.isEmpty()) {
            return "/";
        }

        StringBuilder sb = new StringBuilder();
        while(!list.isEmpty()) {
            String str = list.poll();
            sb.append(str);
        }
        return sb.toString();

    }

    public static void main(String args[]) {

        String path = "/Summer_Semester/EDIS/../../Project3///hw2/";
        String simplified_path = simplifyPath(path);
        System.out.println("The Simplified Path: " + simplified_path);

    }

}










