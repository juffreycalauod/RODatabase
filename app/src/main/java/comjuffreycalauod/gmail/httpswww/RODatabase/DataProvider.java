package comjuffreycalauod.gmail.httpswww.RODatabase;

/**
 * Created by Mr.Darkycible on 7/18/2017.
 */

public class    DataProvider

{

    public DataProvider(int img_res, String name)

    {


        this.setImg_res(img_res);

        this.setText_res(name);


    }

    //variables
    private String text_res;
    private int img_res;



    public int getImg_res() {
        return img_res;
    }

    public void setImg_res(int img_res) {
        this.img_res = img_res;
    }

    public String getText_res() {
        return text_res;
    }

    public void setText_res(String text_res) {
        this.text_res = text_res;
    }






}


