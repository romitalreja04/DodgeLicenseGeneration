package testemail;

import java.io.File;

import org.eclipse.jgit.api.Git;


public class Download {
	  
	   public static void main( String[] args ) throws Throwable{
		   String remotePath = "https://github.com/defunctzombie/node-util.git";
		   String localPath = "C:\\downloadedCode";
		   File repoDir = new File(localPath);
		   Git.cloneRepository()
	        .setURI(remotePath)
	        .setDirectory(repoDir)
	        .call();
	   }
	}
