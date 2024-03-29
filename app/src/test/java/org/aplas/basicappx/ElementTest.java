package org.aplas.basicappx;

<<<<<<< HEAD
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
=======
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.Adapter;
>>>>>>> cd3735a (B1-BasicAppX)
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TextView;

<<<<<<< HEAD
import java.lang.reflect.Field;
=======
>>>>>>> cd3735a (B1-BasicAppX)
import java.util.List;

public class ElementTest extends ViewTest {
    private View component;
    private String compName;
    private String msgHeader;
    private String className;
    //private ArrayList<HashMap> testList = new ArrayList<>();

    public ElementTest(View comp) {
        component =comp;
        compName = component.getContext().getResources().getResourceEntryName(component.getId());
        className = component.getClass().getSimpleName();
        msgHeader = "\n( "+compName+" - "+className+" ) ";
    }

    public void testIdName(String expected) {
        String msg = msgHeader + "Element Id Name is not suitable\n";
        testItem(expected,compName,msg,1);
    }

    public void testWidth(int expected) {
        String msg = msgHeader + "Element width is not suitable\n";
        testItem(expected,component.getLayoutParams().width,msg,1);
    }

    public void testHeight(int expected) {
        String msg = msgHeader + "Element height is not suitable\n";
        testItem(expected,component.getLayoutParams().height,msg,1);
    }

    public void testWeight(float expected) {
        String msg = msgHeader + "Element height is not suitable\n";
        testItem(expected,((LinearLayout.LayoutParams)component.getLayoutParams()).weight,msg,1);
    }

    public void testOrientation(int expected) {
        String msg = msgHeader + "Element orientation is not suitable\n";
        testItem(expected,((LinearLayout)component).getOrientation(),msg,1);
    }

    public void testTopMargin(int expected) {
        String msg = msgHeader + "Element top margin is not suitable\n";
        if (component.getLayoutParams().getClass().equals(RelativeLayout.LayoutParams.class)) {
            testItem(expected,((RelativeLayout.LayoutParams)component.getLayoutParams()).topMargin,msg,1);
        } else {
            testItem(expected, ((LinearLayout.LayoutParams) component.getLayoutParams()).topMargin, msg, 1);
        }
    }

    public void testBottomMargin(int expected) {
        String msg = msgHeader + "Element top margin is not suitable\n";
        if (component.getLayoutParams().getClass().equals(RelativeLayout.LayoutParams.class)) {
            testItem(expected,((RelativeLayout.LayoutParams)component.getLayoutParams()).bottomMargin,msg,1);
        } else {
            testItem(expected, ((LinearLayout.LayoutParams) component.getLayoutParams()).bottomMargin, msg, 1);
        }
    }

    public void testPaddingLeft(int expected) {
        String msg = msgHeader + "Element left padding is not suitable\n";
        testItem(expected,component.getPaddingLeft(),msg,1);
    }
    public void testPaddingRight(int expected) {
        String msg = msgHeader + "Element right padding is not suitable\n";
        testItem(expected,component.getPaddingRight(),msg,1);
    }
    public void testPadding(int expected) {
        String msg = msgHeader + "Element padding is not suitable\n";
        testItem(expected,component.getPaddingTop(),msg,1);
        testItem(expected,component.getPaddingBottom(),msg,1);
        testItem(expected,component.getPaddingLeft(),msg,1);
        testItem(expected,component.getPaddingRight(),msg,1);
    }
<<<<<<< HEAD

//    WIP !
    public void testBgColor(int expected) {
        String msg = msgHeader + "Element Background color is not suitable\n";
        int buttonColor =0;
        String aw="";
        if (component.getBackground() instanceof ColorDrawable) {
            testItem(expected,((ColorDrawable) component.getBackground()).getColor(),msg,1);
        }else {
            buttonColor =getButtonBgColor((Button)component);
            testItem(expected,buttonColor,msg,1);
        }
=======
    public void testBgColor(int expected) {
        String msg = msgHeader + "Element Background color is not suitable\n";
        testItem(expected,((ColorDrawable) component.getBackground()).getColor(),msg,1);
>>>>>>> cd3735a (B1-BasicAppX)
    }

    public void testBgGradientColor(int[] expected) {
        String msg = msgHeader + "Element Background gradient color is not suitable\n";
        GradientDrawable draw = (GradientDrawable) component.getBackground();
        //draw.getColors()
        testItem(expected[0],draw.getColors()[0],msg,1);
        testItem(expected[1],draw.getColors()[1],msg,1);
        testItem(expected[2],draw.getColors()[2],msg,1);
    }

    public void testTextString(String expected) {
        String msg = msgHeader + "Element text string is not suitable\n";
        testItem(expected,((TextView)component).getText().toString(),msg,1);
    }

    public void testTextFace(Typeface expected) {
        String msg = msgHeader + "Element text font is not suitable\n";
        testItem(expected,((TextView)component).getPaint().getTypeface(),msg,1);
    }

    public void testTextStyle(int expected) {
        String msg = msgHeader + "Element text style (bold/italic/normal) is not suitable\n";
        testItem(expected,((TextView)component).getPaint().getTypeface().getStyle(),msg,1);
    }

    public void testTextColor(int expected) {
        String msg = msgHeader + "Element text color is not suitable\n";
        testItem(expected,((TextView)component).getTextColors().getDefaultColor(),msg,1);
    }

    public void testTextSize(float expected) {
        String msg = msgHeader + "Element text size is not suitable\n";
        /*if (className.equals("AppCompatSpinner")) {
            testItem(expected,((Spinner)component).get,msg,1);
        }*/
        testItem(expected,((TextView)component).getTextSize(),msg,1);
    }

    public void testGravity(int expected) {
        String msg = msgHeader + "Element gravity orientation is not suitable\n";
        if (className.equals("AppCompatSpinner")) {
            testItem(expected,((Spinner)component).getGravity(),msg,1);
        } else if (className.equals("AppCompatTextView")) {
            testItem(expected, ((TextView) component).getGravity(), msg, 1);
        } else if (className.equals("TableLayout")) {
            testItem(expected, ((LinearLayout)component).getGravity(), msg, 1);
        }
    }

    public void testAllCaps(boolean expected) {
        String msg = msgHeader + "Element all caps is not suitable\n";
        testItem(expected,((TextView)component).isAllCaps(),msg,1);
    }

    public void testHintText(String expected) {
        String msg = msgHeader + "Element hint text is not suitable\n";
        testItem(expected,((TextView)component).getHint().toString(),msg,1);
    }

    public void testInputType(int expected) {
        String msg = msgHeader + "Element input type is not suitable\n";
        testItem(expected,((TextView)component).getInputType(),msg,1);
    }

    public void testIsEnabled(boolean expected) {
        String msg = msgHeader + "Element enabled value is not suitable\n";
        testItem(expected,component.isEnabled(),msg,1);
    }

    public void testPromptText(String expected) {
        String msg = msgHeader + "Element prompt text is not suitable\n";
        testItem(expected,((Spinner)component).getPrompt().toString(),msg,1);
    }

    public void testSpinnerMode(int expected) {
        String msg = msgHeader + "Element mode is not suitable\n";
        if (expected==0) {
            testItem(expected,((Spinner)component).getDropDownVerticalOffset(),msg,1);
        } else {
            testItem(expected,((Spinner)component).getDropDownVerticalOffset()>0,msg,3);
        }
    }

    public void testSpinnerContent(List expected) {
        String msg = msgHeader + "Element spinner content is not suitable\n";

        Adapter list = ((Spinner)component).getAdapter();
        String res = "";
        for (int i=0; i<list.getCount(); i++){
            res += list.getItem(i)+";";
            /*
            if (!expected.get(i).equals(list.getItem(i))) {
                isValid = false;
            }*/
        }
        testItem(listToString(expected),res,msg,1);
    }

<<<<<<< HEAD
    public int getButtonBgColor(Button button){
        int buttonColor = 0;

        if (button.getBackground() instanceof ColorDrawable) {
            ColorDrawable cd = (ColorDrawable) button.getBackground();
            buttonColor = cd.getColor();
        }

        if (button.getBackground() instanceof RippleDrawable) {
            RippleDrawable rippleDrawable = (RippleDrawable) button.getBackground();
            Drawable.ConstantState state = rippleDrawable.getConstantState();
            try {
                Field colorField = state.getClass().getDeclaredField("mColor");
                colorField.setAccessible(true);
                ColorStateList colorStateList = (ColorStateList) colorField.get(state);
                buttonColor = colorStateList.getDefaultColor();
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return buttonColor;
    }

=======
>>>>>>> cd3735a (B1-BasicAppX)
    public void testSpinnerContent(String[] expected) {
        /*
        String msg = msgHeader + "Element spinner content is not suitable\n";
        //testItem(expected,((Spinner)component).getGravity(),msg,1);
        Adapter list = ((Spinner)component).getAdapter();
        boolean isValid = true;
        for (int i=0; i<list.getCount(); i++){
            if (!expected[i].equals(list.getItem(i))) {
                isValid = false;
            }
        }
        testItem(true,isValid,msg,1);
        */
        String msg = msgHeader + "Element spinner content is not suitable\n";

        Adapter list = ((Spinner)component).getAdapter();
        String res = "";
        for (int i=0; i<list.getCount(); i++){
            res += list.getItem(i)+";";
        }
        testItem(arrayToString(expected),res,msg,1);
    }

    public void testSpinnerContent(String expected) {
        testSpinnerContent(expected.split("\\,"));
    }

    public void testSelected(boolean expected) {
        String msg = msgHeader + "Element checked/selected value is not suitable\n";
<<<<<<< HEAD
        if (component.getClass().equals(com.google.android.material.checkbox.MaterialCheckBox.class)) {
=======
        if (component.getClass().equals(androidx.appcompat.widget.AppCompatCheckBox.class)) {
>>>>>>> cd3735a (B1-BasicAppX)
            testItem(expected,((CheckBox)component).isChecked(),msg,1);
        } else {
            testItem(expected,((RadioButton)component).isChecked(),msg,1);
        }
    }

    public void testImageSrc(String expected) {
        String msg = msgHeader + "Element image source is not suitable\n";
        //int resId = R.font.cambria;
        int resId = component.getContext().getResources().getIdentifier(expected, "drawable",component.getContext().getPackageName());
        testItem(expected,component.getResources().getResourceEntryName(resId),msg,1);
        //int resId = (Integer) component.gett
        //        testItem(0,resId,msg,1);
        //testItem(expected,component.getResources().getResourceEntryName(resId),msg,1);
    }

    public void testLayoutBelow(int expected) {
        String msg = msgHeader + "Element layout below is not suitable\n";
        RelativeLayout.LayoutParams para = (RelativeLayout.LayoutParams)component.getLayoutParams();
        testItem(expected, para.getRule(3), msg, 1); //check android:layout_below
        //para.get
    }

    public void testLinearHorizontal(boolean expected) {
        String msg = msgHeader + "Element layout center horizontal is not suitable\n";
        RelativeLayout.LayoutParams para = (RelativeLayout.LayoutParams)component.getLayoutParams();
        int val = (expected)?-1:0;
        /*int val=0;
        int idx=0;
        for (int i=0; i<para.getRules().length; i++){
            if (para.getRule(i)!=0) {
                val=para.getRule(i);
                idx=i;
            }
        }*/
        testItem(val, para.getRule(14), msg, 1); //check android:layout_below
    }

    public void testStrectchColumn(boolean expected) {
        String msg = msgHeader + "Element column strecth is not suitable\n";
        testItem(expected,((TableLayout)component).isStretchAllColumns(),msg,1);
    }

    public void testVisibility(int visibility) {
        String msg = msgHeader + "Element visibility is not suitable\n";
        testItem(visibility,component.getVisibility(),msg,1);
    }
}
