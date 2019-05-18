import java.util.*;

public class SimplifyPath {

    public static String simplifyPath(String path) {

        Stack<String> stack = new Stack<String>();
        // Handle all trailing slashes
        while(path.length() > 0 && path.charAt(path.length() - 1) == '/') {
            path = path.substring(0, path.length() - 1);
        }

        // Parsing the path
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

        // Handling the back paths, current paths and redundant slashes
        LinkedList<String> result = new LinkedList<String>();
        int back = 0;
        while(!stack.isEmpty()) {
            String top = stack.pop();
            if(top.equals("/.") || top.equals("/")) {
                // Do nothing because these are current directory paths
            }
            // In case of back directory
            else if(top.equals("/..")) {
                back += 1;
            }
            // In case of a possible directory
            else {
                if(back > 0) {
                    back -= 1;
                }
                else {
                    result.push(top);
                }
            }
        }

        // If result is Empty, return a slash
        if(result.isEmpty()) {
            return "/";
        }

        // Return the resultant path
        StringBuilder sb = new StringBuilder();
        while(!result.isEmpty()) {
            String str = result.pop();
            sb.append(str);
        }
        return sb.toString();

    }

    public static void main(String args[]) {

        String path = "/a/./b/../../c/";
        String simplified_path = simplifyPath(path);
        System.out.println("The Simplified Path: " + simplified_path);        

    }

}






















