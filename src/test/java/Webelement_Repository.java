/**
 * Created by Tania Rimy on 1/2/2017.
 */
public interface Webelement_Repository {

    //Home Page
    String xpath_admin_button = "//table[@id = 'topNavAdminButton']";

    //Admin Menu & Submenu xpaths
    String xpath_menu_feature_configuration = "//li[@id = 'admin-menu-group-tab-panel__admin-menu-configuration']";
    String xpath_submenu_notetypes = "//li[@id = 'admin-menu-configuration__configuration.note-types";
    String xpath_submenuTitle_notetypes = "//*[contains[@text, 'Note Types']]";

}
