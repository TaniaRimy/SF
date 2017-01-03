import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Tania Rimy on 1/2/2017.
 */
public class Managing_Notes_Type extends Shared_Class implements Webelement_Repository{

    @Test
    public void managingNotesType() {

        setup_Launch_Browser();
        logIn();
        topTabNavigation(xpath_admin_button, "Admin");
        navigateAdminSubmenu(xpath_menu_feature_configuration, xpath_submenu_notetypes, xpath_submenuTitle_notetypes);
    }
}
