package projecttracker

class ListProjectsController {
	
	def index = {
		redirect(action: current)
	}

    def current = { 
		// //render "Project Tracker Video Tutorials"
		//def projectName = "Project Tracker Video Tutorials"
		//def dueDate = "3/3/2012"
		//[project:projectName, date:dueDate]
		def allProjects = ListProjects.list()
		[allProjects:allProjects]
		
	}
	
	def overdue = {
		render "Order Valentines Day Package"
	}
	
	
	
	
}
