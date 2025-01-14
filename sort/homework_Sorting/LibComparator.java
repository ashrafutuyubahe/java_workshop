    package sort.homework_Sorting;

    import java.util.Comparator;

    public class LibComparator implements Comparator<Library_Mngs> {

        @Override
        public int compare(Library_Mngs bok1 , Library_Mngs bok2 ) {
            
            int checkAuthors=  bok1.getAuthor().compareTo(bok2.getAuthor());

            if(checkAuthors !=0){
                return checkAuthors;
            } else{
            return bok1.getPubYear().compareTo(bok2.getPubYear());
            }

        

        }
        
        


    }
