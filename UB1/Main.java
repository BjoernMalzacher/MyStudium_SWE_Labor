public class Main{

    public class Value {
        private int I;

        public int getI(){
            return I;
        }
        public void setI(int I){
            this.I = I;
        }
        Value(int I){
            this.I = I;
        }
    }

    public class Element {
        private Value val;
        private Element succ;
        public Element getSucc() {
            return succ;
        }
        public void setSucc(Element succ) {
            this.succ = succ;
        }
        public Value getVal() {
            return val;
        }
        public Element(Value val){
            this.val = val;
        }

    }

    public class FIFO{
        private  Element first;
        private Element last;

        public void write(Value v){
            Element newEL = new Element(v);
            if(isEmpty()){
                first = newEL;
            }else{
                last.setSucc(newEL);
            }
            last = newEL;
     
            

        }
        public Value read(){
            Value val = null;
            if(!isEmpty()){
                val= first.getVal();
                Element el = this.first;
                first = el.getSucc();
                el.setSucc(null);
    
                return val;
            }

            return null;
        }
    
    public boolean isEmpty(){
        if(first == null) {return true;}

        return false;
    }
}
    public static void main(String[] args) {
        Main mainInstance = new Main(); // Create an instance of Main
        mainInstance.run();
        
    }

   
        public void run(){
        FIFO fifo = new FIFO();
        for (int i = 0; i < 10; i++) {
            Value val = new Value(i);
            fifo.write(val);

        }
        while(!fifo.isEmpty()){
            System.out.println(fifo.read().getI());
        }
        }
    
}