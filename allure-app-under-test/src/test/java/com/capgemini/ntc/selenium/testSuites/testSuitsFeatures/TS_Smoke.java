package com.capgemini.ntc.selenium.testSuites.testSuitsFeatures;

import org.junit.runner.RunWith;

import com.capgemini.ntc.selenium.testSuites.testType.TestsSmoke;
import com.capgemini.ntc.test.core.utils.junitoolboxpi.WildcardPatternSuiteBF;
import com.googlecode.junittoolbox.ExcludeCategories;
import com.googlecode.junittoolbox.IncludeCategories;
import com.googlecode.junittoolbox.SuiteClasses;

@RunWith(WildcardPatternSuiteBF.class)
@IncludeCategories({ TestsSmoke.class })
@ExcludeCategories({})
@SuiteClasses({ "**/*Test.class" })
public class TS_Smoke {

}
