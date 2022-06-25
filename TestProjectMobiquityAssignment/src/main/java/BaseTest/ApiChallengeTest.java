package BaseTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Assertions;
import org.testng.Assert;

public class ApiChallengeTest  {   	

	@Test
	public void testValidateFormatOfEmailsInCommentsSectionForAllPostsOfAUser()  {	
		
	
	Users users = new Users();
	Comments comments = new Comments();	
	Post posts = new Post();
	//JsonFileReader jsonReader = new JsonFileReader();	
	users.getResponseByUserName("Delphine");		
	List<Integer> userIdList= users.getListOfValuesOfIDInResponse();		
	for(Integer userId: userIdList) {			
			posts.getResponseByUserID(userId.toString());
			List<Integer> postIdList = posts.getListOfValuesOfPostIDInResponse();			
			for(Integer PostId: postIdList) {
				comments.getResponseByPostID(PostId.toString());
				System.out.println("PostId for " + PostId.toString());
				List<String> emails= comments.getListOfValuesOfEmailsInResponse();
				for (String item : emails) {
					boolean var = comments.isValid(item);
					if (var =true) {
				    System.out.println(" email is valid for " + item);}
					
				    else {System.out.println(" email is NOT valid for " + item);}	    
				
				}
				
			}
		}
		
	}

}
