package game;

public class Suit {
    
    private String SuitTxt;
    
        public enum suits {HEARTS, CLUBS,SPADES,DIAMONDS};
        
        private Suit(String SuitTxt) 
        {
            this.SuitTxt=SuitTxt;
        }
        
	public String printSuit() {
            return SuitTxt;		
	}
}