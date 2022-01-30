class prblm_2037 {
    public int minMovesToSeat(int[] seats, int[] students) {
        int count = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i=0; i<seats.length; i++){
            count += (seats[i]>=students[i]) ? seats[i]-students[i] : students[i]-seats[i];
        }
        return count;
        
    }
}
