import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Tania Rimy on 1/2/2017.
 */
public class Managing_Notes_Type extends Shared_Class implements Webelement_Repository{

    @Test
    public void managingNotesType() {

        setup_Launch_Browser();
        logIn(ygold_userID, user_password);
        topTabNavigation(xpath_admin_button, "Admin");
        navigateAdminSubmenu(id_menu_feature_configuration, id_submenu_notetypes, xpath_submenuTitle_notetypes);
    }
}
