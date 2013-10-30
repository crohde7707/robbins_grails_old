package projecttrack1



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Project)
class ProjectTests {

	void testNoBlank() {
		mockForConstraintsTests Project  //mocks the validate method for Project
		
		def proj = new Project(name: 'Kay', dueDate: new Date() + 1,
			                   description: 'try me')
//		assert proj.validate()
	}
}
