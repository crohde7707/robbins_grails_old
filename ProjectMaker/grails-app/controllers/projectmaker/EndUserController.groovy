package projectmaker

class EndUserController {
	def scaffold = true

    def index = { 
		redirect (action: list)
	}
}
