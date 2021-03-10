class Main
{
    public static void main(String[] args) {
        Person jon = new Person();

        jon.setName("Jon Pumpernickle");
        jon.setAge(104);

        System.out.println(jon.getName() + jon.getAge());
    }
}