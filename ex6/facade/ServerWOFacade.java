public class ServerWOFacade {
	public static void main(String[] args) {
		ScheduleServer scheduleServer = new ScheduleServer();
		ServerFacade serverFacade = new ServerFacade(scheduleServer);

		serverFacade.startServer();

		serverFacade.stopServer();
	}

}
