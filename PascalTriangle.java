class Solution {
    public List<List<Integer>> generate(int numRows) {
        List <List<Integer>> result = new ArrayList<>();// variavel do resultado final

        if(numRows == 0){
            return result;
        }

        List <Integer> firstRow = new ArrayList<>(); 

        firstRow.add(1);

        result.add(firstRow);
      // criar a primeira lista e adiciona-la para nao dar IndexOutOfBoundsException

        for(int i = 1 ; i < numRows; i++){
             
             List <Integer> prevRow = result.get(i-1); // 
             List <Integer> row = new ArrayList<>();

             row.add(1); // primeira linha é sempre 1

            for(int j = 1; j < i ; j++){
                row.add(prevRow.get(j-1)+prevRow.get(j)); // é a soma das duas variaveis da linha anterior 
            }
            row.add(1); // ultima linha é sempre 1 

            result.add(row);
        }
        return result;
    }
}
