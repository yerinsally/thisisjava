package ch06.problem;

public class Base {
    public void service(String state) {
    	switch(state) {
    	case "낮" -> this.day();
    	case "밤" -> this.night();
    	case "오후" -> this.afternoon();
    	}
//    	if(state.equals("낮")) {		//"낮".equals(state)
//    		this.day();
//    	}else if(state.equals("밤")) {
//    		this.night();
//    	}else if(state.equals("오후")) {
//    		this.afternoon();
//    	}
    }

    public void day() {
        System.out.println("낮에는 열심히 일하자");
    }
    public void night() {
    	System.out.println("night");
    }
    public void afternoon(){
        System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
    }
}
