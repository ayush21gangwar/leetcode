class Solution {
    public boolean rotateString(String s, String goal) {
        String check = s + s;
if (s.length() == goal.length()){
return check.contains(goal);
}
else {
return false;
}
    }
}