package intermediate.lecture_04_atTag;

import org.junit.runner.RunWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;

@RunWith(JUnitPlatform.class)
@SelectPackages("intermediate.lecture_04_atTag")
@IncludeTags("development")
class DevelopmentTests {}
