/**
 * Created by Genevieve on 11-Sep-16.
 */
public class Fiction extends Book
{
    public Fiction(String title)
    {
        super(title);
        setPrice();
    }
    public void setPrice()
    {
        super.price = 24.99;
    }

}