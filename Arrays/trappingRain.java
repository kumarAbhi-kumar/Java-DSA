public class trappingRain {

    public static int totalVolumeOfRain(int arr[], int widtdh){
        int lenOfArray = arr.length;
        if( lenOfArray <= 2){
            return 0;
        }

        int volume = 0;
        int []lMax = new int[ lenOfArray ];
        int []rMax = new int[ lenOfArray ];
        
        lMax[0] = 0;
        lMax[1] = arr[0];

        rMax[ lenOfArray- 1 ] = 0;
        rMax[ lenOfArray- 2 ] = arr[ lenOfArray - 1 ];

        // Initializing the Left Max Auxilary Array
        for(int i = 2; i < lenOfArray; i++)
            lMax[ i ] = ( arr[ i-1 ] > lMax[ i-1 ] ) ? arr[ i-1 ] : lMax[ i-1 ];
        
        System.out.println("Left Max Auxilary Array : ");
        for(int i : lMax)
            System.out.print(i + " ");
        System.out.println();
        
        // Initiaalizing the Right Max Auxilary Array
        for(int i = lenOfArray - 3; i >= 0; i--)
            rMax[ i ] = ( arr[ i+1 ] > rMax[ i+1 ] ) ? arr[ i+1 ] : rMax[ i+1 ];

        System.out.println("Right Max Auxilary Array : ");
        for(int i : rMax)
            System.out.print(i + " ");
        System.out.println();

        int waterHeight;
        for(int i = 0; i < lenOfArray; i++){
            waterHeight = Math.min(lMax[i], rMax[i]) - arr[ i ];
            if( waterHeight > 0 )
                volume += waterHeight * widtdh;
        }
        
        return volume;
    }
    public static void main(String[] args) {
        int arr[] = {4, 4, 4};
        System.out.println("Total Volume of rain Water Captured = "+totalVolumeOfRain(arr, 1)+" square units");
    }
        
}
