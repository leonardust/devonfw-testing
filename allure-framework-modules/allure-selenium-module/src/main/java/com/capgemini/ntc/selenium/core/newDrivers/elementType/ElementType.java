package com.capgemini.ntc.selenium.core.newDrivers.elementType;

enum ElementType {

	BUTTON("Button"),
	LIST("List"),
	INPUT_TEXT("Input text element"),
	RADIO("Radio"),
	DROPDOWN("Dropdown"),
	CHECKBOX("Checkbox"),
	LABEL("Label"),
	TAB("Tab"),
	TOOLTIP("Tooltip"),
	NAVIGATION_BAR("Navigation Bar"),
    MENU("Menu"),
    IFRAME("iFrame")
	;

	private String value;

	private ElementType(String value) {
		this.value = value;
	}

	public String toString() {
		return value;
	}

}
