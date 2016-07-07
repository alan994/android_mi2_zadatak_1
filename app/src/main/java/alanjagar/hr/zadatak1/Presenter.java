package alanjagar.hr.zadatak1;

/**
 * Created by Alan on 07.07.2016..
 */
public class Presenter implements IPresenter {

    private IView iView;

    public Presenter(IView iView){
        this.iView = iView;
    }

    @Override
    public void checkIfStringNumberIsEven(String strNumber) {
        try{
            String msg = null;
            int number = Integer.parseInt(strNumber);
            if(number % 2 == 0){
                msg = "Broj " + String.valueOf(number) + " je paran";
            }
            else{
                msg = "Broj " + String.valueOf(number) + " je ne paran";
            }
            if(msg != null){ // Potencijalno nepotrebno pošto ili će puknut ili će biti paran ili neparan
                iView.showOutput(msg);
            }
        }
        catch (Exception ex){
            String msg = "Tekst koji ste unjeli nije moguće pretvoriti u broj";
            iView.showError(msg);
        }
    }
}
