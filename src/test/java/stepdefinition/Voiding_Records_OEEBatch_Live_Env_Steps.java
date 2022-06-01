package stepdefinition;

import io.cucumber.java.en.Then;
import pages.Voiding_Records_OEEBatch_Live_Env;

public class Voiding_Records_OEEBatch_Live_Env_Steps {
	Voiding_Records_OEEBatch_Live_Env VoidingRecordsInOEEBatch = new Voiding_Records_OEEBatch_Live_Env();
	
	@Then("^User void the Records in OEE Batch$")
	public void User_void_the_Records_in_OEE_Batch() throws Throwable {
		VoidingRecordsInOEEBatch.VoidingRecordsiInOEEBatch();
	}
	
}
