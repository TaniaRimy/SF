/**
 * Created by Tania Rimy on 1/2/2017.
 */
public interface Webelement_Repository {

    //Home Page
    String xpath_admin_button = "//table[@id = 'topNavAdminButton']";

    //Admin Menu & Submenu xpaths
    String xpath_menu_feature_configuration = "//li[@aria-controls='admin-menu-configuration']";
    String id_menu_feature_configuration = "admin-menu-group-tab-panel__admin-menu-configuration";
    String xpath_submenu_notetypes = "//li[@aria-controls='configuration.note-types']";
    String id_submenu_notetypes = "admin-menu-configuration__configuration.note-types";
    String xpath_submenuTitle_notetypes = "//*[text()= 'Note Type']";
    //li[@aria-controls='admin-menu-configuration']


    //User ID & Password
    String ygold_userID = "ygold";
    String user_password = "st@rfish";

}
