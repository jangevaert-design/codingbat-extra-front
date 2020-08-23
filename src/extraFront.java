public class extraFront {
  public String extraFront(String str) {
    int len = str.length();
    if (len < 2) {
      return str + str + str;
    } else {
      return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
    }
  }
}
