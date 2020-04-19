
import { NativeModules } from 'react-native';

const { RNCardv } = NativeModules;
console.log("NativeModules::::::", NativeModules)
console.log("RNCardv::::::", RNCardv) // {"getConstants": [Function anonymous], "show": [Function nonPromiseMethodWrapper]}

export default RNCardv;
