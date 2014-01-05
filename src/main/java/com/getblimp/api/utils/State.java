/* github_apache_lic */

package com.getblimp.api.utils;

/**
 * Created with IntelliJ IDEA.
 * User: froilan
 * Date: 14-1-2
 * Time: 20:41
 * To change this template use File | Settings | File Templates.
 */
public enum State {
    INACTIVE("INACTIVE"),
    ACTIVE("ACTIVE");

    private String value;

    State(String value){
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
