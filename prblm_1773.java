class prblm_1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        if(ruleKey.equals("type")){
            int col = 0;
			     for (int row = 0; row < items.size(); row++) {
                if(ruleValue.equals(items.get(row).get(col))){
                    count++;
                }
            }
        }else if(ruleKey.equals("color")){
            int col = 1;
			  for (int row = 0; row < items.size(); row++) {
                if(ruleValue.equals(items.get(row).get(col))){
                    count++;
                }
            }
        }else {
            int col = 2;
			for (int row = 0; row < items.size(); row++) {
                if(ruleValue.equals(items.get(row).get(col))){
                    count++;
                }
            }
        }
        return count;
    }
}