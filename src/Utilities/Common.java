package Utilities;

import Runtime.*;

public class Common {
    public static final String RESET = "\033[0m";
    public static final String RED_BOLD = "\033[1;31m";
    public static final String GREEN = "\033[0;32m";
    public static final String CYAN_BOLD = "\033[1;36m";
    public static final int line_num = 21;

    public static void Print(String msg) {
        System.out.print(msg);
    }

    public static void Print(Color c, String msg) {
        String colored_msg;
        switch (c) {
            case GREEN:
                colored_msg = GREEN + msg + RESET;
                break;
            case RED_BOLD:
                colored_msg = RED_BOLD + msg + RESET;
                break;
            case CYAN_BOLD:
                colored_msg = CYAN_BOLD + msg + RESET;
                break;
            default:
                colored_msg = msg;
                break;
        }
        System.out.print(colored_msg);
    }

    public static String GetAbsolutePath(String given_path) {
        if (given_path.charAt(0) == '/') {
            return given_path;
        } else {
            return Executor.variables.get("PWD") + "/" + given_path;
        }
    }

}
