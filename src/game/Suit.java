package game;

public class Suit {
    
    private String SuitTxt;
    
        public enum suits {HEARTS, CLUBS,SPADES,DIAMONDS};
        
        private Suit(String SuitTxt) //Since constructor is private in uml so how will we give value to SuitTxt
        {
            this.SuitTxt=SuitTxt;
        }
        
	public String printSuit() {
            return SuitTxt;		
	}
}




/*
public class Suit {
    
        public enum Suits {HEARTS, CLUBS,SPADES,DIAMONDS};
        private final Suit suitTxt;

        private Suit(Suit SuitTxt) 
        {
            this.suitTxt=SuitTxt;
        }
        
	public Suit printSuit() {
            return this.suitTxt;		
	}
}

*/