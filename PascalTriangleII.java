class Solution {
    public List<Integer> getRow(int rowIndex) {
        List <List<Integer>> result = new ArrayList<>();
        List <Integer> firstRow = new ArrayList<>();

        firstRow.add(1);

        result.add(firstRow);
        if(rowIndex == 0){
            return firstRow;
        }

       

        for(int i = 1 ; i < rowIndex+1; i++){
             
             List <Integer> prevRow = result.get(i-1);
             List <Integer> row = new ArrayList<>();

             row.add(1);

            for(int j = 1; j < i ; j++){
                row.add(prevRow.get(j-1)+prevRow.get(j));
            }
            row.add(1);

            result.add(row);

            if(i == rowIndex){
                firstRow = row;
            }
        }
        return firstRow;
    }
}
