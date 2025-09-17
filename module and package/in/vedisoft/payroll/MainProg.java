// package class should start with package stmt
//make package public if its accessed outside of packaged class
//compile with \
//interpret using .

package in.vedisoft.payroll;

import in.vedisoft.payroll.logics.Logic;
import in.vedisoft.payroll.ui.UserInterface;
import in.vedisoft.payroll.utilities.*;


// import in.vedisoft.payroll.utilities.*;
// import in.vedisoft.payroll.logics.*;
// import in.vedisoft.payroll.ui.*;


public class MainProg {
    public static void main(String[] args) {
        Utility a = new Utility();
        UserInterface b = new UserInterface();
        Logic c = new Logic();
    }
}