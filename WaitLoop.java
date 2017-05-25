//A Very Simple Example
class WaitLoop {
  public static void main(String[] args){
      System.out.println("Sleeping 100000...");
        try {
            Thread.sleep(100000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                        }
            }
}

