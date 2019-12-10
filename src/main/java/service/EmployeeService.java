package service;import dao.EmployeeDAO;import model.Employee;import javax.ws.rs.*;import javax.ws.rs.core.MediaType;import java.util.List;@Path("/employees")public class EmployeeService {    @GET    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })    public List<Employee> getEmployees_JSON() {        List<Employee> listOfCountries = EmployeeDAO.getAllEmployees();        return listOfCountries;    }    @GET    @Path("/{empId}")    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })    public Employee getEmployee(@PathParam("empId") String empId) {        return EmployeeDAO.getEmployee(empId);    }    @POST    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })    public Employee addEmployee(Employee emp) {        return EmployeeDAO.addEmployee(emp);    }    @PUT    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })    public Employee updateEmployee(Employee emp) {        return EmployeeDAO.updateEmployee(emp);    }    @DELETE    @Path("/{empId}")    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })    public void deleteEmployee(@PathParam("empId") String empId) {        EmployeeDAO.deleteEmployee(empId);    }}