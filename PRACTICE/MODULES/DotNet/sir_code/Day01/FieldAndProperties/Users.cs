namespace user
{
    public class Users
    {

        private int userId;
        public int UserId { set; get; }
        private string username;
        public string Username
        {
            set { username = value;}
            get { return username; }
        }
        private string password;
        public string Password { set; get; }

        public String MobileNumber { get; set; }

        private int myVar;
        public int MyProperty
        {
            get { return myVar; }
            set { myVar = value; }
        }

    }
}